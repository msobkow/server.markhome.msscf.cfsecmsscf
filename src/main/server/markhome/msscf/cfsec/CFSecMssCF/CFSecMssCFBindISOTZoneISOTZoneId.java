
// Description: Java 11 MssCF Binding for ISOTZone Column ISOTZoneId.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.math.*;
import java.sql.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import org.apache.commons.codec.binary.Base64;

/**
 *	CFSecMssCFBindISOTZoneISOTZoneId binds ISOTZone.ISOTZoneId
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindISOTZoneISOTZoneId
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindISOTZoneISOTZoneId() {
		super();
	}

	public CFSecMssCFBindISOTZoneISOTZoneId( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"ISOTZone",
			"ISOTZoneId" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindISOTZoneISOTZoneId.getValueObject() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		short iSOTZoneId;
		if( genDef instanceof ICFSecISOTZoneObj ) {
			iSOTZoneId = ((ICFSecISOTZoneObj)genDef).getRequiredISOTZoneId();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecISOTZoneObj" );
		}

		return( iSOTZoneId );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindISOTZoneISOTZoneId.expandBody() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		String ret;

		if( genDef instanceof ICFSecISOTZoneObj ) {
			short iSOTZoneId = ((ICFSecISOTZoneObj)genDef).getRequiredISOTZoneId();
			ret = Short.toString( iSOTZoneId );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecISOTZoneObj" );
		}

		return( ret );
	}

}
