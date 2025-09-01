
// Description: Java 11 MssCF Binding for ServiceType Column ServiceTypeId.

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
 *	CFSecMssCFBindServiceTypeServiceTypeId binds ServiceType.ServiceTypeId
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindServiceTypeServiceTypeId
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindServiceTypeServiceTypeId() {
		super();
	}

	public CFSecMssCFBindServiceTypeServiceTypeId( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"ServiceType",
			"ServiceTypeId" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindServiceTypeServiceTypeId.getValueObject() ";

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

		int serviceTypeId;
		if( genDef instanceof ICFSecServiceTypeObj ) {
			serviceTypeId = ((ICFSecServiceTypeObj)genDef).getRequiredServiceTypeId();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecServiceTypeObj" );
		}

		return( serviceTypeId );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindServiceTypeServiceTypeId.expandBody() ";

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

		if( genDef instanceof ICFSecServiceTypeObj ) {
			int serviceTypeId = ((ICFSecServiceTypeObj)genDef).getRequiredServiceTypeId();
			ret = Integer.toString( serviceTypeId );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecServiceTypeObj" );
		}

		return( ret );
	}

}
