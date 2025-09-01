
// Description: Java 11 MssCF Binding for ISOCtryCcy Column ISOCcyId.

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
 *	CFSecMssCFBindISOCtryCcyISOCcyId binds ISOCtryCcy.ISOCcyId
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindISOCtryCcyISOCcyId
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindISOCtryCcyISOCcyId() {
		super();
	}

	public CFSecMssCFBindISOCtryCcyISOCcyId( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"ISOCtryCcy",
			"ISOCcyId" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindISOCtryCcyISOCcyId.getValueObject() ";

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

		short iSOCcyId;
		if( genDef instanceof ICFSecISOCtryCcyObj ) {
			iSOCcyId = ((ICFSecISOCtryCcyObj)genDef).getRequiredISOCcyId();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecISOCtryCcyObj" );
		}

		return( iSOCcyId );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindISOCtryCcyISOCcyId.expandBody() ";

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

		if( genDef instanceof ICFSecISOCtryCcyObj ) {
			short iSOCcyId = ((ICFSecISOCtryCcyObj)genDef).getRequiredISOCcyId();
			ret = Short.toString( iSOCcyId );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecISOCtryCcyObj" );
		}

		return( ret );
	}

}
